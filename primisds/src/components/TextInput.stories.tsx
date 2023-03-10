import { Meta, StoryObj } from '@storybook/react'
import { Package } from 'phosphor-react'
import { TextInput, TextInputInputProps, TextInputRootProps } from './TextInput'

export default {
    title: 'Components/TextInput',
    component: TextInput.Root,
    args: {
        children: [
        <>
                <TextInput.Icon>
                  <Package />
                </TextInput.Icon>
                <TextInput.Input placeholder="Buscar Produtos"/>
                </>
        ],
    },
    argTypes: {
        children: {
         table: {
          disabled: false,
            }
        }
    }
} as Meta<TextInputRootProps>

export const Default: StoryObj<TextInputRootProps> = { }

export const WhitoutIcon: StoryObj<TextInputRootProps> = { 
    args: {
        children:<TextInput.Input placeholder="Buscar Produtos"/>
    }
}

