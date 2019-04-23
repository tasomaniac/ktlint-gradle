package org.jlleitschuh.gradle.ktlint.reporter

enum class ReporterType(
    val reporterName: String,
    val fileExtension: String
) {
    PLAIN("plain", "txt"),
    PLAIN_GROUP_BY_FILE("plain?group_by_file", "txt"),
    CHECKSTYLE("checkstyle", "xml"),
    JSON("json", "json");
}
