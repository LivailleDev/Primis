import { Meta, StoryObj } from '@storybook/react'
import { TableInput } from './Table';
import { Table, TableInputRootProps } from './Table'

export default {
    title: 'Components/Table',
    component: Table,
    args: {
        children: [],
    },
    argTypes: {}

} as Meta<TableInputRootProps>

export const Default: StoryObj<TableInputRootProps> = {}

export const WhitoutIcon: StoryObj<TableInputRootProps> = {}
