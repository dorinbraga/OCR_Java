# Application for identifying the letters in an image of text

## Overview

Optical Character Recognition(OCR) helps to identify the letters in an image.
It is a type of softweare that can automatically analyze printed text and turn it into a form that a computer can process more easily.
OCR is the proceess of transforming a text image into the text itself - in other words, producing a TXT or DOC file from a PNG or other scanned format of a printed page.

## How it works?

- Image data preprocessing (for example: grayscale conversion, smoothing, filtres)
- Detection of lines, words, characters
- Produces a list of characters based on trained data (traineddata; edDataPath() is used to set the path)
- PostProcessing recognizes the characters and then chooses the best ones after the previous step and linguistic data (dictionaries, grammar rules, etc)
(/image/OCRworks.jpg)
## Result
So, for the picture (/image/poza1.png) I had the result (/image/poza2.png)
