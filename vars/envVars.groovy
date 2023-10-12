def setCustomEnvironment() {
    def envVars = [:]
    envVars['MY_VARIABLE'] = 'some_value'
    envVars['ANOTHER_VARIABLE'] = 'another_value'
    return envVars
}
