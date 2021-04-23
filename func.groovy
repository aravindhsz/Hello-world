
import hudson.model.*    
import jenkins.security.*
import jenkins.model.*
import hudson.security.*
import hudson.model.User   


  def rest(jobname){
    //getting the names of the jobs
    def jobNames = []
    Jenkins.instance.getAllItems(AbstractItem.class).each { 
  jobNames.add(it.fullName) 
}
    def jobNames_1 = []
    jobNames_1.add(jobname)

// For each project
for(item in Hudson.instance.items) {
  for(jobName in jobNames_1){
    if(item.name.equalsIgnoreCase(jobName))
    {
        Set<String> users = new HashSet<>();
      //adding the users to give access
        users.add('user2');
      echo "providing access of the job:${jobName} to the user:user2"
      echo "instead of ${jobname}"
     // println(item+"to user1")
      
      
      //providing all the permissions
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

      
      
    }
  }
 }
    //getting all the user
    /*User.getAll().each { user ->   
      println user}
   */

     
  }
return this
