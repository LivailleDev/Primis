import React from 'react';
import { useTable } from 'react-table';
import ReactTable from 'react-table';

export interface TableProps {
    columns: [{
        Header: 'Id',
        accessor: 'id'
    }, {
        Header: 'Descrição',
        accessor: 'descricao'
    }, {
        Header: 'Preço de Compra',
        accessor: 'precoDeCompra'
    }, {
        Header: 'Preço de Venda',
        accessor: 'precoDeVenda'
    }, {
        Header: 'Quantidade',
        accessor: 'quantidade'
    }, {
        Header: '',
        accessor: 'editar'
    }, {
        Header: '',
        accessor: 'excluir'
    },];

    data: [
        { id: 1, descricao: 'Agua Mineral', precoDeCompra: 1, precoDeVenda: 2, quantidade: 213, editar: '', excluir: '' },
        { id: 2, descricao: 'Heineker', precoDeCompra: 2, precoDeVenda: 3, quantidade: 32, editar: '', excluir: '' },
        { id: 3, descricao: 'Suco de Laranja', precoDeCompra: 1, precoDeVenda: 3, quantidade: 56, editar: '', excluir: '' },
        { id: 4, descricao: 'Vodca Absolut', precoDeCompra: 2, precoDeVenda: 5, quantidade: 75, editar: '', excluir: '' },
    ];
}


const Table: React.FC<TableProps> = ({ columns, data }) => {
    const tableInstance = useTable({ columns, data });

    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow,
    } = tableInstance;

    return (
        <table {...getTableProps()}>
            <thead>
                {headerGroups.map(headerGroup => (
                    <tr {...headerGroup.getHeaderGroupProps()}>
                        {headerGroup.headers.map(column => (
                            <th {...column.getHeaderProps()}>{column.render('Header')}</th>
                        ))}
                    </tr>
                ))}
            </thead>
            <tbody {...getTableBodyProps()}>
                {rows.map(row => {
                    prepareRow(row);
                    return (
                        <tr {...row.getRowProps()}>
                            {row.cells.map(cell => (
                                <td {...cell.getCellProps()}>{cell.render('Cell')}</td>
                            ))}
                        </tr>
                    );
                })}
            </tbody>
        </table>
    );
};