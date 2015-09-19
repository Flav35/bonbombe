SVGs=$(wildcard images/*.svg)
PDFs=$(SVGs:.svg=.pdf)
all: final.pdf

final.pdf: dia plantuml final.tex $(PDFs)
	pdflatex final.tex
	pdflatex final.tex
	rm *.aux *.toc *.log *.maf *.mtc *.mtc0 *.out

images/%.pdf: images/%.svg
	rsvg-convert -f pdf $< -o $@

dia:
	for dia in images/*.dia; do\
		if [ ! -e $${dia%%.*}.pdf ]; then\
			dia -e $$dia.eps -t eps $$dia;\
			ps2pdf -dEPSCrop $$dia.eps $${dia%%.*}.pdf;\
			rm -f $$dia.eps;\
		fi;\
	done;\

plantuml:
	for uml in images/*.pu ; do\
		java -jar ../ressources/plantuml.jar $$uml;\
	done;\

clean :
	rm *.aux *.toc *.log *.maf *.mtc *.mtc0 *.out *.pdf
	rm -f images/*plantuml.png