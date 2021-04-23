
import hudson.model.*    
import jenkins.security.*
import jenkins.model.*
import hudson.security.*

  def rest(){
    def jobNames = []
   /* hudson.model.Hudson.instance.getView('VIEW_NAME').items.each() { 
      jobNames.add(it.fullDisplayName) 
    }*/
    Jenkins.instance.getAllItems(AbstractItem.class).each { 
  jobNames.add(it.fullName) 
}
    for(i in jobNames){
      println(i)
    }
    
    def userIDs = ['user1_ID','user2_ID', 'user3_ID']

// For each project
for(item in Hudson.instance.items) {
  println(item.name)
  for(jobName in jobNames){
    if(item.name.equalsIgnoreCase(jobName))
    {
      println(item.name)
      /*
      for(userID in userIDs){
        User user = User.getOrCreateByIdOrFullName(userID)
        String sID = user.getId() ;   

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

       item.addProperty(authorizationMatrixProperty)
       item.save()
      }
      */
    }
  }
 }

     
  }
return this
