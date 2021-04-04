def call(Map varParams) {  
  checkout([$class: 'GitSCM', 
      branches: [[name: varParams.branch]], 
      extensions: [], 
      userRemoteConfigs: [[credentialsId: 'b301cd92-1cd3-4e71-aeba-2864fcf1d58e', 
      url: varParams.url]]])  
  }
