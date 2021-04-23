properties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'first', randomName: 'choice-parameter-12195427924100', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return["master","branch1","branch2"]']]], [$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'second', randomName: 'choice-parameter-12195487706900', referencedParameters: 'first', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''if(first.equals("master")){
return["first_pipeline"]
}
node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Worspace */
        echo "...***repository CHECKOUT SCM***..."
        checkout scm
    }
    stage('Load') {
    echo "********Loading the groovy file into the pipeline********"
    code = load 'func.groovy'
  }


    stage('ACCESS PROVIDING') {
        
        echo "****Calling the function****"
        def bodyText = code.rest()
        echo "****Provided access to the users specified****"
        //app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
