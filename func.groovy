
import hudson.model.*    
import jenkins.security.*
import jenkins.model.*
import hudson.security.*
import hudson.model.User   


  def rest(){
    def jobNames = []
   /* hudson.model.Hudson.instance.getView('VIEW_NAME').items.each() { 
      jobNames.add(it.fullDisplayName) 
    }*/
    Jenkins.instance.getAllItems(AbstractItem.class).each { 
  jobNames.add(it.fullName) 
}
   
    
    def userIDs = ['user1']

// For each project
for(item in Hudson.instance.items) {
  echo "item:"
  println(item.name)
  for(jobName in jobNames){
    if(item.name.equalsIgnoreCase(jobName))
    {
      echo "items equals jobname"
      println(item.name)
      
      for(userID in userIDs){
        User user = User.getOrCreateByIdOrFullName(userID)
        String sID = user.getId() ;   
        println(user)
        println(sID)
/*
        def authorizationMatrixProperty = item.getProperty(AuthorizationMatrixProperty.class)

        authorizationMatrixProperty?.add(hudson.model.Item.CANCEL, sID)
        authorizationMatrixProperty?.add(Item.WORKSPACE, sID);
        authorizationMatrixProperty?.add(Item.BUILD, sID);
        authorizationMatrixProperty?.add(Run.DELETE, sID);
        authorizationMatrixProperty?.add(Run.UPDATE, sID);
        authorizationMatrixProperty?.add(Item.CONFIGURE, sID);
        authorizationMatrixProperty?.add(Item.DELETE, sID);
        authorizationMatrixProperty?.add(Item.READ, sID);
       // authorizationMatrixProperty?.add(com.cloudbees.plugins.credentials.CredentialsProvider.VIEW, sID);
       */
        Set<String> users = new HashSet<>();
        users.add('user1');
       Map<Permission,Set<String>> newPermissions = new HashMap<Permission, Set<String>>()
       newPermissions.put(Item.READ,users)
        item.addProperty(new AuthorizationMatrixProperty(newPermissions))
        item.save()

      }
      
    }
  }
 }
    
    //User.getAll().each { user ->   
   //println user}

     
  }
return this
