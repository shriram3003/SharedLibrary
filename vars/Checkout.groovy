def call() {  
  checkout([$class: 'GitSCM', 
      branches: [[name: '*/main']], 
      extensions: [], 
      userRemoteConfigs: [[credentialsId: 'b301cd92-1cd3-4e71-aeba-2864fcf1d58e', 
      url: 'https://github.com/shriram3003/Release_Report.git']]])  
  }
