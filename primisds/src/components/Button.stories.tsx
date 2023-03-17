import { Meta, StoryObj } from '@storybook/react'
import { Button, ButtonRootProps } from './Button'
import { FilePlus } from 'phosphor-react';

export default {
    title: 'Components/Button',
    component: Button.Root,
    args: {
        children: [
        <>
                  <FilePlus className='text-yellow-100'/> Novo 
         </>   
        ]
    },
    argTypes: {}

} as Meta<ButtonRootProps>

export const Default: StoryObj<ButtonRootProps> = {}
