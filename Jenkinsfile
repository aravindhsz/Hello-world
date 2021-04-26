properties([parameters([[$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'jobname', randomName: 'choice-parameter-265213950348800', referencedParameters: '', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''def jobNames_all = []
    Jenkins.instance.getAllItems(AbstractItem.class).each { 
  jobNames_all.add(it.fullName) 
}

jobNames.each { job ->
return job}
}''']]]])])
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
        
        echo "****Calling the function using the jobname :$params.jobname****"
        def arg = jobname
        def bodyText = code.rest(arg)
        echo "****Provided access to the users specified****"
        //app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
