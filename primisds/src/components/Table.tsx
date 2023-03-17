import { ReactNode, useState } from 'react';
import { Slot } from '@radix-ui/react-slot';



export interface TableIconProps {
  children: ReactNode;
}

function TableIcon(props: TableIconProps) {
  const Comp = 'a';
  return (
  <Slot className="w-6 h-6 text-yellow-100">
    <Comp href="#">
      {props.children}
    </Comp>
  </Slot>
  )
};

TableIcon.displayName = 'Table.Icon'

export function TableProdutos(buttonEditar: TableIconProps ) {
  const [products, setProducts] = useState([

    //futuro children
    { id: 1, descricao: 'vodka', unidade: 'un', precodecompra: '5', precodevenda: '60', quantidade: '700'},
    { id: 2, descricao: 'agua', unidade: 'un', precodecompra: '1', precodevenda: '5', quantidade: '500'},
    { id: 3, descricao: 'cerveja', unidade: 'un', precodecompra: '2', precodevenda: '7', quantidade: '200'},

  ]);
  const [query, setQuery] = useState('');  


  function addProduct() {
    const newProduct = { id: 4, descricao: 'coca-cola', unidade: 'un', precodecompra: '1', precodevenda: '7', quantidade: '200' }
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
              <td className="text-center flex justify border  border-brown-200">{buttonEditar.children}</td>
            </tr>
          ))}
        </tbody>
      </table>
      {/* <button onClick={() => addProduct()}>Adcionar Produto</button> */}
    </div>
  );
}

TableProdutos.displayName = 'Table.Table'

export const Table = {
  Table: TableProdutos,
  Icon: TableIcon,
}