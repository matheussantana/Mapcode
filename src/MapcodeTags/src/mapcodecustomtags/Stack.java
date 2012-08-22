package mapcodecustomtags;
/**
 * 
 * @author matheus
 *
Mapcode - Mapping Generated Code to a Reference Implementation – Towards Automatic Code Migration

This plugin implements an initial step towards automatic code migration in the context of MDE-based
projects that use template-based code generation (Java Emitter Templates(JET) engine) backed up by
a reference implementation. Different types of mapping between a template and the generated code
are identified, each one covering a different code generation possibility.
The mapping is established by the automatic insertion, in the generated code, of special
markings that delineate the boundaries of each mapping type.

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

Created by: Matheus Santana (matheusslima <at> yahoo <dot> com <dot> br)

Date: 21/08/2012

For futher information see:

[Project website] (http://matheussantana.github.com/Mapcode/)
[Code repository] (https://github.com/matheussantana/Mapcode)
[More info] (http://www2.comp.ufscar.br/~matheus_santana/static.php?page=static120821-224438)

 */
public class Stack {

    private int valorOrbital;
    private Stack proximo;
    private int last_index;
	private int currentIndex;

    public Stack() {
    	last_index = 0;
    	currentIndex = 0;
	}
    // Get e Set
    public void setProximo(Stack proximo) {
        this.proximo = proximo;
    }

    public void setValorOrbital(int valorOrbital) {
        this.valorOrbital = valorOrbital;
    }

    public Stack getProximo() {
        return this.proximo;
    }

    public int getValorOrbital() {
        return this.valorOrbital;
    }
    // End Get and Set

    // Stack operations

    // Insert
    public void push(Stack pilha, int valorOrbital){
        Stack temporario = new Stack();
        temporario.setValorOrbital(valorOrbital);
        temporario.setProximo(pilha.getProximo());
        pilha.setProximo(temporario);
    }
    // Insert
    public void push(Stack pilha){
        Stack temporario = new Stack();
        temporario.setValorOrbital(currentIndex);
        temporario.setProximo(pilha.getProximo());
        pilha.setProximo(temporario);
        last_index = currentIndex;
        currentIndex = currentIndex+1;
    }
    // End Insert

    // Remove
    public int pop(Stack pilha){
        Stack temporario = new Stack();
        int topo = pilha.top(pilha);
        if(pilha.vazia(pilha) == true){
            temporario = pilha.getProximo();
            pilha.setProximo(temporario.getProximo());
            temporario = null;
            return topo;
        }
        else{
	            return -1;
        }
    }
    // End remove

    public int top(Stack pilha){
        Stack temporario = new Stack();
        temporario = pilha.getProximo();
        if(temporario.vazia(temporario) == true)
           return temporario.getValorOrbital();
        else{
           return -1;
        }
    }

    // Empty
    public boolean vazia(Stack pilha){
        if(pilha == null)
            return(false);
        else
            return(true);
    }
}
