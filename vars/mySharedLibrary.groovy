// vars/mySharedLibrary.groovy

def mySwitchMethod(value) {
     def parameters = [:]
    switch (value) {
        case 'case1':
            echo "Performing action for case 1"
            parameters['namespace'] = 'fdp-int1'
            parameters['cluster'] = 'integration1'
            break
        case 'case2':
            echo "Performing action for case 2"
            parameters['namespace'] = 'fdp-int2'
            parameters['cluster'] = 'integration2'
            break
        default:
            echo "Default action for unknown cases"
            parameters['namespace'] = 'fdp-int3'
            parameters['cluster'] = 'integration3'
            break
    }
    return parameters
}
