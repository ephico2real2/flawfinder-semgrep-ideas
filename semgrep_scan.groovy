#!/usr/bin/env groovy

def semgrepAnalysis() {
    // Define the build command. This assumes you're using `make`.
    def buildCommand = 'make semgrep_scan'

    try {
        // Execute the command.
        sh(buildCommand)

    } catch (Exception e) {
        // If the build fails, handle the error.
        echo "Failed to run semgrep scan: ${e.getMessage()}"
        throw e
    }
}

return this
