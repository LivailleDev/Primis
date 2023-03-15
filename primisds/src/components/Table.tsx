import React, { ReactNode, useState } from 'react';
import { Slot } from '@radix-ui/react-slot';

export interface TableInputRootProps {
    children: ReactNode;
  }

export interface TableProps {
    children: ReactNode;
    asChild?: boolean;
}

function TableInputRoot(props: TableInputRootProps) {
    return (
      <div className="flex items-center gap-3 h-12 py-4 px-3 rounded bg-gray-500 w-full focus-within:ring-1 ring-gray-400">
        {props.children}
      </div>
    )
  }

export function TableInputIcon(props: TableInputRootProps) {
    return (  
      <Slot className="w-6 h-6 text-yellow-100">
        {props.children}
      </Slot>
    )
  }

export function Table() {
    const [products, setProducts] = useState([

        //futuro children
        { id: 1, descricao: 'vodka', unidade: 'un', precodecompra: '5', precodevenda: '60', quantidade: '700', editar: "", excluir: "" },
        { id: 2, descricao: 'agua', unidade: 'un', precodecompra: '1', precodevenda: '5', quantidade: '500', editar: "", excluir: "" },
        { id: 3, descricao: 'cerveja', unidade: 'un', precodecompra: '2', precodevenda: '7', quantidade: '200', editar: "", excluir: "" },

    ]);
    const [query, setQuery] = useState('');

    /*
        function handleQueryChange(event) {
            setQuery(event.target.value);
        }*/
    interface Props {
        onSearch: (value: string) => void;
    }

    function TableInputIcon(props: TableInputRootProps) {
        return (  
          <Slot className="w-6 h-6 text-yellow-100">
            {props.children}
          </Slot>
        )
      }



        function addProduct() {
            const newProduct = { id: 4, descricao: 'coca-cola', unidade: 'un', precodecompra: '1', precodevenda: '7', quantidade: '200', editar: "", excluir: "" }
            setProducts([...products, newProduct]);
        }

        /*
      const filteredProducts = products.filter((product) =>
           product.name.toLowerCase().includes(query.toLowerCase())
       ); */


        return (
            <div>
                <table className="table-auto bg-gray-500 text-gray-300 text-xs placeholder:text-gray-400 w-full focus:outline-none focus: ring-1 ring-brown-200 border-y-black border-x-brown-200">
                    <thead className= " border focus: ring-1">
                        <tr className="text-center">
                            <th >DESCRIÇÃO</th>
                            <th>UNIDADE</th>
                            <th>PREÇO DE COMPRA</th>
                            <th>PREÇO DE VENDA</th>
                            <th>QUANTIDADE</th>
                            <th>EDITAR</th>
                            <th>EXCLUIR</th>
                        </tr>
                    </thead>
                    <tbody >
                        {products.map(product => (
                            <tr key={product.id} className="text-center">
                                <td>{product.descricao}</td>
                                <td>{product.unidade}</td>
                                <td>{product.precodecompra}</td>
                                <td>{product.precodevenda}</td>
                                <td>{product.quantidade}</td>
                                <td>{product.editar}</td>
                                <td>{product.excluir}</td>

                            </tr>
                        ))}
                    </tbody>
                </table>
            {/* <button onClick={() => addProduct()}>Adcionar Produto</button> */}
            </div>
        );
    }

    export const TableInput = {
        Root: TableInputRoot,
        //Input: TableInputIconProps,
        Icon: TableInputIcon,
      }
          

    export default Table;
    