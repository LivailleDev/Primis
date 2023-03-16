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
    <div >
      <table className="table-auto border border-brown-200 bg-gray-500 text-gray-300 text-xs placeholder:text-gray-400 w-full focus:outline-none focus: ring-1 ring-brown-200">
        <thead >
          <tr className="text-center">
            <th className="text-sm px-4 py-2 border  border-brown-200">DESCRIÇÃO</th>
            <th className="text-sm border  border-brown-200">UNIDADE</th>
            <th className="text-sm border  border-brown-200">PREÇO DE COMPRA</th>
            <th className="text-sm border  border-brown-200">PREÇO DE VENDA</th>
            <th className="text-sm border  border-brown-200">QUANTIDADE</th>
            <th className="text-sm border  border-brown-200">EDITAR</th>
            <th className="text-sm border  border-brown-200">EXCLUIR</th>
          </tr>
        </thead>
        <tbody>
          {products.map(product => (
            <tr key={product.id} >
              <td className="text-center border  border-brown-200">{product.descricao}</td>
              <td className="text-center border  border-brown-200">{product.unidade}</td>
              <td className="text-center border  border-brown-200">{product.precodecompra}</td>
              <td className="text-center border  border-brown-200">{product.precodevenda}</td>
              <td className="text-center border  border-brown-200">{product.quantidade}</td>
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
