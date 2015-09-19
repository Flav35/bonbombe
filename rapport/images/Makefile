FICHIERS_PDF= CasUtilisation.pdf maquette.pdf Diagramme_Navigation.pdf

.SUFFIXES : .pdf .eps .tex .fig .dia .ps 

all: ${FICHIERS_PDF}

.eps.pdf:
	epstopdf $*.eps

.ps.pdf:
	ps2pdf $*.ps

.fig.pdf:
	fig2dev -L pdf $*.fig $*.pdf

.dia.eps:
	dia --export=$*.eps --filter=eps-pango $*.dia

clean:
	rm -f ${FICHIERS_PDF};
	rm -f *.aux;
	rm -f *.log;
	rm -f *.pdf;
