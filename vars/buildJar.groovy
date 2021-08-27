#!/usr/bin/env groovy

def call(String package) {
    echo "building the application for branch $BRANCH_NAME"
    sh "${package}"
}
