#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Pushing The Docker File...'
    sh "docker push ${imageName}"
}