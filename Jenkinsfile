properties([parameters([choice(choices: ['first_pipeline', 'error', 'node_check'], description: 'click the jobname to get access', name: 'jobname')])])
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
