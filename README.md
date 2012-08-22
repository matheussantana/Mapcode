#Mapcode

## About

**Mapcode** - Mapping Generated Code to a Reference Implementation – Towards Automatic Code Migration

This plugin implements an initial step towards automatic code migration in the context of MDE-based projects that use template-based code generation([Java Emitter Templates](http://www.eclipse.org/modeling/m2t/?project=jet) (JET) engine - [Eclipse IDE](http://www.eclipse.org/)) backed up by a reference implementation. Different types of mapping between a template and the generated code are identified, each one covering a different code generation possibility. The mapping is established by the automatic insertion, in the generated code, of special markings that delineate the boundaries of each mapping type.

Created by: 

    Matheus Santana
    (matheus santana <at> comp <dot> ufscar <dot> br)
    UFSCar, Federal University of São Carlos, Brazil
    Computer Departament
    Center of Exact Sciences and Technology
    http://www2.comp.ufscar.br/~matheus_santana/


For futher information see:

[Project website] (http://matheussantana.github.com/Mapcode/)

[Code repository] (https://github.com/matheussantana/Mapcode)

[More info] (http://www2.comp.ufscar.br/~matheus_santana/static.php?page=static120821-224438)

## Mapcode Tags

One custom tag was created for each of the seven mapping types
described earlier.

*   \<mbct:copy\>: simple copy;
*   \<mbct:get\>: simple substitution;
*   \<mbct:set\>: variable attribution, used in indirect substitution;
*   \<mbct:if\>: conditional;
*   \<mbct:iterate\>: repetition;
*   \<mbct:include\>: inclusion of another template; and
*   \<mbct:file\>: creation of a new output file.

The new tags reproduce the behavior of their corresponding original tags. Forexample, <m:if> works in the same way as <c:if>. But the new tags also generate annotations (Java comments) that mark relevant code locations, according to each mapping type. For example, the tag <m:copy> copies a piece of code from the template to the generated code, and automatically inserts a comment in the beginning and end. The tag <m:iterate> implements repetition, marking the beginning and end of thegenerated code, and also the start of each iteration. Figure 9 shows these two examples.

![alt text](http://www2.comp.ufscar.br/~matheus_santana/images/mapcode/mapcode.png "Mapcode mapping types")


For type 1, the inserted comment (//T1:templ1.jet#1) indicates the type of mapping (T1), the template that generated this piece of code (templ1.jet), and a unique identifier (number 1 after character #). For type 4, similar comments surround the generated code (//T4:templ2.jet#1). In addition, other comments (//T4:i=1,
//T4:i=2 and //T4:i=3) mark the places where each iteration starts.

With the new tags, it is possible to generate exactly the same type of code as with the original tags, but with the side effect that now the generated code is completely annotated, and the mapping between generated code and the templates is established.

The result is that, for each piece of generated code, it is possible to identify the mapping type, the template that generated this particular piece of code and even which part of the template was responsible for it, by locating the nearest surrounding generated comments. Code migration can be made based on this information.

##What is JET?##

JET is typically used in the implementation of a "code generator". A code-generator is an important component of Model Driven Development (MDD). The goal of MDD is to describe a software system using abstract models (such as EMF/ECORE models or UML models), and then refine and transform these models into code. Although is possible to create abstract models, and manually transform them into code, the real power of MDD comes from automating this process. Such transformations accelerate the MDD process, and result in better code quality. The transformations can capture the "best practices" of experts, and can ensure that a project consistently employes these practices. [Source](http://www.eclipse.org/modeling/m2t/?project=jet#jet)


##Paper

[Lucrédio and Fortes, Mapping Generated Code to a Reference Implementation – Towards Automatic Code Migration.] (http://www2.comp.ufscar.br/~matheus_santana/paper/lucredio.pdf)

[Lima and Lucrédio, Mapeamento entre geradores de código e uma implementação de referência] (http://www2.comp.ufscar.br/~matheus_santana/paper/Mapcode.pdf)

##Requirements

[Eclipse Modelling IDE](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/junor)
[Java Emitter Templates](http://www.eclipse.org/modeling/m2t/downloads/?project=jet) (JET) engine


##Installation

  1. Go to eclipse directory
  2. Copy br.ufscar.dc.mapcode_1.0.0.noqualifier.jar(inside the build/ folder) to the plugin/ directory

Exemple of Mapcode can be found in doc/example

##Getting started with JET

 [JET Tutorial Part 1 (Introduction to JET)](http://www.eclipse.org/articles/Article-JET/jet_tutorial1.html)

 [Create more -- better -- code in Eclipse with JET](http://www.ibm.com/developerworks/opensource/library/os-ecl-jet/)


##License

The Mapcode is released under the GNU Public License 3.

You are free to use and modify the Anemo. All changes 
must be uploaded to Git Hub under Mapcode.

    Copyright (C) 2012 Matheus Santana
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
