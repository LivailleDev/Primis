import { Meta, StoryObj } from '@storybook/react';
import { Table, TableIconProps,  } from './Table';
import { Pencil } from 'phosphor-react';
import { Trash } from 'phosphor-react';

export default {
    title: 'Components/Table',
    component: Table.Table,
    args: {
        children: [
            <>
                <Table.Icon>
                    <Pencil />
                </Table.Icon>
                <Table.Icon>
                    <Trash />
                </Table.Icon>
            </>
        ],
    },
    argTypes: {}

} as Meta<TableIconProps>

export const Default: StoryObj<TableIconProps> = {}
