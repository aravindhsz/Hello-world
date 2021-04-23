
import hudson.model.*    
import jenkins.security.*
import hudson.security.*

  def rest(){
    def jobNames = []
    hudson.model.Hudson.instance.getView('VIEW_NAME').items.each() { 
      jobNames.add(it.fullDisplayName) 
    }
     
  }
return this
