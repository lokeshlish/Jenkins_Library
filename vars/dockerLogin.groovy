#!/usr/bin/env groovy


def call(String dockerCred) {
    withCredentials([script.usernamePassword(credentialsId: "${dockerCred}", passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
    }
}







