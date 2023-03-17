import { Slot } from '@radix-ui/react-slot';
import { ButtonHTMLAttributes, ReactNode } from 'react';

export interface ButtonRootProps {
    children: ReactNode;
}

function ButtonRoot(props: ButtonRootProps) {
    return (
        <div className="text-gray-400 flex items-center gap-2 h-10 py-4 px-2 w-20 rounded bg-gray-500 focus-within:ring-1 ring-gray-400">
            {props.children}
        </div>
    )
}

ButtonRoot.displayName = 'Button.Root'

export interface ButtonIconProps {
    children: ReactNode;
}

function ButtonIcon(props: ButtonIconProps) {
    return (
        <Slot className=" text-yellow-100 ">
            {props.children}
        </Slot>
    )
}

ButtonIcon.displayName = 'Button.Icon'

export interface ButtonButtonProps extends ButtonHTMLAttributes<HTMLButtonElement> {}


function ButtonButton(props: ButtonButtonProps) {
    return (
      <button className='flex'
        {...props}
      >
        {props.children}
        </button>
    )
  }
  
  ButtonButton.displayName = 'Button.Button'

export const Button = {
    Root: ButtonRoot,
    Button: ButtonButton,
    Icon: ButtonIcon,
}
