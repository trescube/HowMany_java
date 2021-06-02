load("@io_bazel_rules_groovy//groovy:groovy.bzl", "spock_test")

java_binary(
  name = "HowMany",
  srcs = glob(["src/main/java/com/stupidplebs/howmany/*.java"]),
  main_class = "com.stupidplebs.howmany.HowManyWithStreams",
)

java_library(
    name = "lib",
    srcs = glob(["src/main/groovy/**/*.groovy", "src/main/java/**/*.java"]),
)

spock_test(
    name = "tests",
    specs = glob(["src/test/groovy/**/*Spec.groovy"]),
    deps = [":lib"],
)