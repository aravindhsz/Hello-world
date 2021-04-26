properties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'jobnames', randomName: 'choice-parameter-270567138358599', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''
return ["one","two","three"]''']]]])])
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
