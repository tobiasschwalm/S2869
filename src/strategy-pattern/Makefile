SRC_DIR  = src
OUT_DIR  = out
MAIN     = de.schulung.strategy.Main
SOURCES  = $(shell find $(SRC_DIR) -name "*.java")

.PHONY: all compile run clean

all: compile

compile:
	mkdir -p $(OUT_DIR)
	javac -d $(OUT_DIR) $(SOURCES)

run: compile
	java -cp $(OUT_DIR) $(MAIN)

clean:
	rm -rf $(OUT_DIR)
