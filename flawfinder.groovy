#!/usr/bin/env groovy

def flawfinderAnalysis() {
    // Define the build command. This assumes you're using `make`. 
    // If you're using a different build system with CMake, adjust accordingly.
    def buildCommand = 'make flawfinder'

    try {
        // Execute the command.
        sh(buildCommand)

    } catch (Exception e) {
        // If the build fails, handle the error. For instance, by printing a message.
        echo "Failed to run flawfinder analysis: ${e.getMessage()}"
        throw e  // Re-throw the error to make the build fail.
    }
}

return this  // This allows the script to be loaded with the load step in Jenkins.
