import React, { useState } from 'react';

function ProductTable() {
    const [products, setProducts] = useState([
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
                <table>
                    <thead>
                        <tr>
                            <th>DESCRIÇÃO</th>
                            <th>UNIDADE</th>
                            <th>PREÇO DE COMPRA</th>
                            <th>PREÇO DE VENDA</th>
                            <th>QUANTIDADE</th>
                            <th>EDITAR</th>
                            <th>EXCLUIR</th>
                        </tr>
                    </thead>
                    <tbody>
                        {products.map(product => (
                            <tr key={product.id}>
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
                <button onClick={() => addProduct()}>Adcionar Produto</button>
            </div>
        );
    }

    export default ProductTable;