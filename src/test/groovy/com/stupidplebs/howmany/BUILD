load("@io_bazel_rules_groovy//groovy:groovy.bzl", "spock_test")

package(default_visibility = ["//visibility:public"])

spock_test(
    name = "HowManyWithStreamsTest",
    specs = ["HowManyWithStreamsSpec.groovy"],
    deps = ["//src/main/java/com/stupidplebs/howmany"],
)
