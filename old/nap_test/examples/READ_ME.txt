Hey y'all,

I have corrected the syntax errors and removed the oparators as mentened in
the email from Dr. Loulergue on 2/21/20. Below, I have included instructions
on how to use the test script.

Sincerely,
Kevin Imlay

============================================================================
Note: You don't have to structure your folders exactly as I have. This is
	just for the sake of example, as well as how I have my folders
	structured.

1. Create a folder to act as your root directory for working in.
2. Place your nap.g4 file in the root folder
3. Create another folder called parser in the root folder.
4. Place this folder you have downloaded in the root folder.
5. Place the test.sh shell script in the parser folder.

You should have a structure such as:
	
	ROOT_FOLDER
	  |-> nap.g4
	  |-> parser
		|-> test.sh
	  |-> nap_syntax_examples_corrected

6. Open a terminal (OSX) or Cygwin (Windows) and navigate so that you are in the root folder.
Note: For Windows, download Cygwin.

7. Run the two commands:
	antlr4 -o parser -package parser nap.g4
	javac parser/*.java
8. To run a test, follow the formula:
	sh parser/test.sh nap_syntax_examples_corrected/[test category folder] [test category] -v
Examples (you can copy and paste these too):
	sh parser/test.sh nap_syntax_examples_corrected/block block -v
	sh parser/test.sh nap_syntax_examples_corrected/expr expr -v
	sh parser/test.sh nap_syntax_examples_corrected/function_definition function_definition -v
	sh parser/test.sh nap_syntax_examples_corrected/instruction instruction -v
	sh parser/test.sh nap_syntax_examples_corrected/program program -v