package com.mindera.gradle.slack.utils

/**
 * Created by joaoprudencio on 06/05/15.
 */
class GitUtils {

    public static String branchName() {
        def workingBranch = "git rev-parse --abbrev-ref HEAD".execute().text.trim()
        return workingBranch
    }

    public static String lastCommitAuthor() {
        def lastCommitAuthor = "git log -1 --pretty=%an".execute().text.trim()
        return lastCommitAuthor
    }

    public static String lastCommitMessage() {
        def message = "git log -1 --pretty=%B".execute().text.trim()
        return message
    }

    public static String lastChangedFiles() {
        def message = "git diff --name-status --oneline HEAD~1..HEAD".execute().text.trim();
        return message
    }
}
