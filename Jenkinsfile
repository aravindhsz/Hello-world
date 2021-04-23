
node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Worspace */
        echo "This is the access changing program"
        checkout scm
    }
    stage('Load') {
    code = load 'func.groovy'
  }


    stage('Build image') {
        
        echo "building"
        //app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
