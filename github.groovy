
import groovy.json.JsonSlurper

def getPrBody(){
  int exitcode = 0
for (slave in hudson.model.Hudson.instance.slaves) {
 if (slave.getComputer().isOffline().toString() == "true"){
 println('Slave ' + slave.name + " is offline!"); 
 exitcode++;
 }
}
  if (exitcode > 0){
 println("We have a Slave down, failing the build!");
}
}
return this
