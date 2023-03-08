import { Meta, StoryObj } from '@storybook/react'
import { TextInput, TextInputProps } from './TextInput'

export default {
    title: 'Components/TextInput',
    component: TextInput,
    args: {
        placeholder: 'TEXTO AQUI 123'
    },
    argTypes: {}
} as Meta<TextInputProps>

export const Default: StoryObj<TextInputProps> = {}

