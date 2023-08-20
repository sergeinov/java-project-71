# Makefile
.DEFAULT_GOAL := build-run

build:
	./gradlew installDist
run:
	./build/install/app/bin/app
lint:
	./gradlew checkstyleMain
test:
	./gradlew test
report:
	./gradlew jacocoTestReport
update-deps:
	./gradlew useLatestVersions
clean:
	./gradlew clean

build-run: build run

.PHONY: build