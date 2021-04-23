
import hudson.model.*    
import jenkins.security.*
import hudson.security.*

  def rest(){
    def jobNames = []
    hudson.model.Hudson.instance.getView('VIEW_NAME').items.each() { 
      jobNames.add(it.fullDisplayName) 
    }

    def userIDs = ['user1_ID','user2_ID', 'user3_ID']

    // For each project
    for(item in Hudson.instance.items) {
      for(jobName in jobNames){
        if(item.name.equalsIgnoreCase(jobName))
        {
          println(item.name)

        }
      }
    }
  }
return this
