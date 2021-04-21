node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Worspace */
        echo "This is the branch chosen"
        checkout scm
    }

  stage('Load') {
    code = load 'github.groovy'
  }

 stage('Execute') {
     echo "executing"
     def bodyText = code.getPrBody()
    // println bodyText
     
 }

  
}
