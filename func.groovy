
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

     
  }
return this
