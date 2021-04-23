
import hudson.model.*    
import jenkins.security.*
import jenkins.model.*
import hudson.security.*
import hudson.model.User   


  def rest(){
    //getting the names of the jobs
    def jobNames = []
    Jenkins.instance.getAllItems(AbstractItem.class).each { 
  jobNames.add(it.fullName) 
}

// For each project
for(item in Hudson.instance.items) {
  for(jobName in jobNames){
    if(item.name.equalsIgnoreCase(jobName))
    {
        Set<String> users = new HashSet<>();
      //adding the users to give access
        users.add('user3');
      echo "providing access of the job:${jobName} to the user:user3"
     // println(item+"to user1")
      
      def userIDs = ['user3']
      //providing all the permissions
      for(userID in userIDs){
        User user = User.getOrCreateByIdOrFullName(userID)
        String sID = user.getId() ;  
        echo "demo checking"
      println(user)
        def authorizationMatrixProperty = item.getProperty(AuthorizationMatrixProperty.class)

        authorizationMatrixProperty?.add(hudson.model.Item.CANCEL, sID)
        authorizationMatrixProperty?.add(Item.WORKSPACE, sID);
        authorizationMatrixProperty?.add(Item.BUILD, sID);
        authorizationMatrixProperty?.add(Run.DELETE, sID);
        authorizationMatrixProperty?.add(Run.UPDATE, sID);
        authorizationMatrixProperty?.add(Item.CONFIGURE, sID);
        authorizationMatrixProperty?.add(Item.DELETE, sID);
        authorizationMatrixProperty?.add(Item.READ, sID);
        authorizationMatrixProperty?.add(com.cloudbees.plugins.credentials.CredentialsProvider.VIEW, sID);

       
       
      }
      /*
       Map<Permission,Set<String>> newPermissions = new HashMap<Permission, Set<String>>()
       newPermissions.put(Item.READ,users)
       newPermissions.put(hudson.model.Item.CANCEL, users)
       newPermissions.put(Item.WORKSPACE, users);
       newPermissions.put(Item.BUILD, users);
       newPermissions.put(Run.DELETE, users);
       newPermissions.put(Run.UPDATE, users);
       newPermissions.put(Item.CONFIGURE, users);
       newPermissions.put(Item.DELETE, users);
       newPermissions.put(Item.READ, users);
       item.addProperty(new AuthorizationMatrixProperty(newPermissions))
       item.save()
       */

      
      
    }
  }
 }
    //getting all the user
    /*User.getAll().each { user ->   
      println user}
   */

     
  }
return this
