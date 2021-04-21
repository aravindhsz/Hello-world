
import groovy.json.JsonSlurper

def getPrBody(){
  int exitcode = 0
for (slave in hudson.model.Hudson.instance.slaves) {
 if (slave.getComputer().isOffline().toString() == "true"){
 println('Slave ' + slave.name + " is offline!"); 
 exitcode++;
 }
}
}
