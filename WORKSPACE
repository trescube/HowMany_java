load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "io_bazel_rules_groovy",
    url = "https://github.com/bazelbuild/rules_groovy/archive/0.0.6.tar.gz",
    sha256 = "21c7172786623f280402d3b3a2fc92f36568afad5a4f6f5ea38fd1c6897aecf8",
    strip_prefix = "rules_groovy-0.0.6",
)

load("@io_bazel_rules_groovy//groovy:repositories.bzl", "rules_groovy_dependencies")
rules_groovy_dependencies()
