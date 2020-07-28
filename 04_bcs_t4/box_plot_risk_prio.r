########## Color Def ############
# tubs blue light
tubsBlueLight <- rgb(102,180,211,255, maxColorValue = 255)
# tubs green light
tubsGreenLight <- rgb(172,193,58,255, maxColorValue = 255)
# tubs orange
tubsOrange <- rgb(255,109,0,255, maxColorValue = 255)
# tubs purple
tubsPurple <- rgb(138,48,127,255, maxColorValue = 255)
# tubs yellow
tubsYellow <- rgb(255,200,42,255, maxColorValue = 255)

tubsRed <- rgb(190,30,60,255, maxColorValue = 255)
#TUBS blue dark
tubsBlue <- rgb(0,63,87,255, maxColorValue = 255)

####### set working directory
setwd("C:/Users/t.pett/Documents/01_Research/004_ciaToolsuite/BCS_history/04_bcs_t4/eval")
show(getwd())

### Preparations 
#riskPrio <- read.csv(file="./mergedPrio.csv",header=TRUE, sep=",",colClasses=c("NULL",NA,NA,NA,NA))
riskPrio <- read.csv(file="./mergedPrio.csv",header=TRUE, sep=",")
show(riskPrio)

sampleNames <- c(riskPrio$Sample)

unsortedChvatal <- c(riskPrio$Score.Unsorted.Chvatal)
unsortedICPL <- c(riskPrio$Score.Unsorted.ICPL)
unsortedRandom <- c(riskPrio$Score.Unsorted.Random)
sortedChvatal <- c(riskPrio$Score.Sorted.Chvatal)
sortedICPL <- c(riskPrio$Score.Sorted.ICPL)
sortedRandom <- c(riskPrio$Score.Sorted.Random)

show(sortedRandom)
### Preparation Placeholder
placeholder <- c(rep(NaN,length(sampleNames)))

### write to pdf
 pdf(file='./plots/riskPrio_t4.pdf', width=10, height=10)

boxplot(unsortedChvatal, sortedChvatal, placeholder, unsortedICPL, sortedICPL, placeholder, unsortedRandom, sortedRandom,
     las=2, ylim=c(0,0.5),main="Risk Prioritization Scores First Evolution Step of BCS", ylab = "High Risk Feature Coverage Score", cex.lab =1.4,
     axes=FALSE,
     #par(mai = c(0.5, 0.5, 0.5, 0.5) + 0.1),
     #pch=c(19,19,19,17,17,17),
     #col=c(rep(tubsBlue,length(incling)), rep(tubsRed,length(random))),
     col=c(tubsBlue, tubsRed, tubsOrange, tubsBlue, tubsRed, tubsOrange, tubsBlue, tubsRed),
     cex.main=2,
     cex=c(0.1)
)
axis(1,
     pos=c(0,0),
     at=c(0:9),
     labels=c("", "Unsorted", "Sorted", "", "Unsorted", "Sorted", "", "Unsorted", "Sorted", ""
              ),
     cex.axis=1.5,
     las=2)
axis(2,
     pos=c(0.2,0),
     at=c(0,0.05,0.1,0.15,0.2,0.25,0.3,0.35,0.4,0.45,0.5),
      labels=c("0","0.05","0.1","0.15","0.2","0.25","0.3","0.35","0.4","0.45","0.5"),
     cex.axis=1.4,
     las=1 )
axis(3,
     pos=c(0.5,0),
     at=c(0,1.5,4.5,7.5,9),
     labels=c("","Chvatal","ICPL","Random",""),
     cex.axis=1.5,
     las=1 )
axis(2,
     pos=c(3,0),
     lwd.ticks = 0,
     labels = FALSE,
     #at=c(0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1),
     #labels=c("0","0.1","0.2","0.3","0.4","0.5","0.6","0.7","0.8","0.9","1"),
     las=1 )
axis(2,
     pos=c(6,0),
     lwd.ticks = 0,
     labels = FALSE,
     #at=c(0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1),
     #labels=c("0","0.1","0.2","0.3","0.4","0.5","0.6","0.7","0.8","0.9","1"),
     las=1 )
axis(2,
     pos=c(8.8,0),
     lwd.ticks = 0,
     labels = FALSE,
     #at=c(0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1),
     #labels=c("0","0.1","0.2","0.3","0.4","0.5","0.6","0.7","0.8","0.9","1"),
     las=1 )
grid(col=c("gray60"),lty="dotted", lwd = 0.6)

### write to pdf
 dev.off()#