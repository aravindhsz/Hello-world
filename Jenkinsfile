properties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'first', randomName: 'choice-parameter-12195427924100', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return["master","branch1","branch2"]']]], [$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'second', randomName: 'choice-parameter-12195487706900', referencedParameters: 'first', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''if(first.equals("master")){
return["param1","param2","param3"]
}
else if(first.equals("branch1")){
return["2ndparam1","2ndparam2","2ndparam3"]
}
else if(first.equals("branch2")){
return["3rdparam1","3rdparam2","3rdparam3"]
}''']]]])])
node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Worspace */
        echo "This is the branch chosen: $params.first"
        echo "This is the sub branch chosen$params.second"
        checkout scm
    }

    stage('Build image') {
        

        app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
