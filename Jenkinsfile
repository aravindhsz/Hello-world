properties([parameters([gitParameter(branch: '', branchFilter: '.*', defaultValue: 'mast', description: 'from git repo', name: 'new', quickFilterEnabled: false, selectedValue: 'NONE', sortMode: 'NONE', tagFilter: '*', type: 'PT_BRANCH')])])
node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Worspace */
        echo "This is the branch chosen: $params.new"
        echo "This is the sub branch chosen$params.new"
        checkout scm
    }

    stage('Build image') {
        

        app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
