// vars/mySharedLibrary.groovy

def mySwitchMethod(value) {
    switch (value) {
        case 'case1':
            echo "Performing action for case 1"
            // Add your actions here
            break
        case 'case2':
            echo "Performing action for case 2"
            // Add your actions here
            break
        default:
            echo "Default action for unknown cases"
            // Add your default actions here
            break
    }
}
