all : DossierConception.pdf

DossierConception.pdf : dia plantuml DossierConception.tex
	#make -C Image/
	pdflatex DossierConception.tex
	pdflatex DossierConception.tex
	rm -f *.aux *.toc *.log
	rm -f sources/*.aux sources/*.toc sources/*.log
dia:
	for dia in Image/*.dia; do\
		if [ ! -e $${dia%%.*}.pdf ]; then\
			dia -e $$dia.eps -t eps $$dia;\
			ps2pdf -dEPSCrop $$dia.eps $${dia%%.*}.pdf;\
			rm -f $$dia.eps;\
		fi;\
	done;\

plantuml:
	for uml in Image/*.pu ; do\
		java -jar ../ressources/plantuml.jar $$uml;\
	done;\

clean :
	rm -f *.aux *.toc *.log *.pdf
	rm -f */*.aux */*.toc */*.log */*.pdf
	rm -f Image/*plantuml.png

