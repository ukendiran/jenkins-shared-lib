def call(String env_name) {
    def parameters = [:]
    echo "Env_Name:${env_name}"
    switch (env_name) {
        case 'int':
            parameters['namespace'] = 'fdp-int'
            parameters['cluster'] = 'integration'
            break
        case 'int2':
            parameters['namespace'] = 'fdp-int2'
            parameters['cluster'] = 'integration2'
            break
    }
  return parameters
}
