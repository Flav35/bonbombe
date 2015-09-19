all : DossierSpecification.pdf

DossierSpecification.pdf : DossierSpecification.tex
	make -C Image/
	pdflatex DossierSpecification.tex
	pdflatex DossierSpecification.tex
	rm *.aux *.toc *.log
	rm sources/*.aux sources/*.toc sources/*.log
clean :
	rm *.aux *.toc *.log *.pdf
	rm sources/*.aux sources/*.toc sources/*.log sources/*.pdf
	make clean -C Image/
