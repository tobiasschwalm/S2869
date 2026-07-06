JUNIT = ../../lib/junit.jar
JAVAC = javac
JAVA  = java
OUT   = out

.PHONY: compile run test clean

compile:
	mkdir -p $(OUT)
	$(JAVAC) -cp $(JUNIT) -d $(OUT) $(shell find . -name "*.java")

run: compile
	$(JAVA) -cp $(OUT) abstract_factory.Main

test: compile
	$(JAVA) -jar $(JUNIT) execute --classpath $(OUT) --scan-classpath \
	  --disable-banner --details=tree

clean:
	rm -rf $(OUT)
